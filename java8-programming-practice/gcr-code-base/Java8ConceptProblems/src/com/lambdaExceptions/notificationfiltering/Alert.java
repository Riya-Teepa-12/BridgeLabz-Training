package com.lambdaExceptions.notificationfiltering;

public class Alert {
	private int id;
    private String message;
    private AlertType type;

    public Alert(int id, String message, AlertType type) {
        this.id = id;
        this.message = message;
        this.type = type;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setType(AlertType type) {
		this.type = type;
	}

	public AlertType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", type=" + type +
                '}';
    }
}

