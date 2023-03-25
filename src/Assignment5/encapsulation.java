package Assignment5;

public class encapsulation {

    public class FullyEncapsulation {
        private int number;
        private String name;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }



    public class ReadOnlyEncapsulation {
        private final int number;
        private final String name;

        public ReadOnlyEncapsulation(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }
    }

    public class WriteEncapsulation {
        private int number;
        private String name;

        public void setNumber(int number) {
            this.number = number;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
