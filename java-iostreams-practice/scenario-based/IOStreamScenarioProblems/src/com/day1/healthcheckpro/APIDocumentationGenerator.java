package com.day1.healthcheckpro;

import java.lang.reflect.Method;

public class APIDocumentationGenerator {

    public static void generateDocs(Class<?> controllerClass) {

        System.out.println("\nController: " + controllerClass.getSimpleName());

        for (Method method : controllerClass.getDeclaredMethods()) {

            boolean hasPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean hasAuth = method.isAnnotationPresent(RequiresAuth.class);

            if (!hasPublicAPI && !hasAuth) {
                System.out.println("WARNING: Method '" + method.getName()
                        + "' has no API annotations.");
                continue;
            }

            System.out.println("\nMethod: " + method.getName());

            if (hasPublicAPI) {
                PublicAPI api = method.getAnnotation(PublicAPI.class);
                System.out.println(" - Public API");
                System.out.println(" - Description: " + api.description());
            }

            if (hasAuth) {
                RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                System.out.println(" - Requires Authentication");
                System.out.println(" - Role: " + auth.role());
            }
        }
    }
}