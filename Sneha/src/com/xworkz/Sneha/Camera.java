package com.xworkz.Sneha;

class Camera {
    public void capture(Photo photo) {
        System.out.println("Running Camera");
        if (photo != null) {
            photo.click();
        } else {
            System.out.println("Photo object is null");
        }
    }
}
