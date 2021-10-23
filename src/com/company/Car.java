package com.company;

public class Car {
        private String maxSpeed;
        private String brandName;
        private String color;
        private String vinNumber;
        private double oilPressure;

        public Car(String maxSpeed, String brandName, String color, String vinNumber) {
            this.maxSpeed = maxSpeed;
            this.brandName = brandName;
            this.color = color;
            this.vinNumber = vinNumber;
        }

        public String getMaxSpeed() {
            return maxSpeed;
        }

        public String getBrandName() {
            return brandName;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getVinNumber() {
            return vinNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Car car = (Car) o;

            return vinNumber.equals(car.vinNumber);
        }
    }

