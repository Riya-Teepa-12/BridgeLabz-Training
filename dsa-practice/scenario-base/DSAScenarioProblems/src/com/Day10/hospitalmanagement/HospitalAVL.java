package com.Day10.hospitalmanagement;

public class HospitalAVL {
	private PatientNode root;

    private int height(PatientNode n) {
        return n == null ? 0 : n.height;
    }

    private int balance(PatientNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    private PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Register Patient
    public void registerPatient(int time, String name) {
        root = insert(root, time, name);
    }

    private PatientNode insert(PatientNode node, int time, String name) {
        if (node == null)
            return new PatientNode(time, name);

        if (time < node.checkInTime)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bf = balance(node);

        if (bf > 1 && time < node.left.checkInTime)
            return rightRotate(node);

        if (bf < -1 && time > node.right.checkInTime)
            return leftRotate(node);

        if (bf > 1 && time > node.left.checkInTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bf < -1 && time < node.right.checkInTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    //  Discharge Patient
    public void dischargePatient(int time) {
        root = delete(root, time);
    }

    private PatientNode delete(PatientNode node, int time) {
        if (node == null) return null;

        if (time < node.checkInTime)
            node.left = delete(node.left, time);
        else if (time > node.checkInTime)
            node.right = delete(node.right, time);
        else {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else {
                PatientNode temp = min(node.right);
                node.checkInTime = temp.checkInTime;
                node.patientName = temp.patientName;
                node.right = delete(node.right, temp.checkInTime);
            }
        }

        if (node == null) return null;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bf = balance(node);

        if (bf > 1 && balance(node.left) >= 0)
            return rightRotate(node);

        if (bf > 1 && balance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bf < -1 && balance(node.right) <= 0)
            return leftRotate(node);

        if (bf < -1 && balance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private PatientNode min(PatientNode n) {
        while (n.left != null) n = n.left;
        return n;
    }

    // Display by Arrival Time
    public void displayPatients() {
        inorder(root);
    }

    private void inorder(PatientNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.patientName + " (Check-in: " + node.checkInTime + ")");
        inorder(node.right);
    }
}
