package ru.aston.hometask;

public class Home {
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;

    private Home(String field1, String field2, String field3, String field4, String field5, String field6, String field7, String field8, String field9, String field10, String field11, String field12, String field13, String field14, String field15) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.field6 = field6;
        this.field7 = field7;
        this.field8 = field8;
        this.field9 = field9;
        this.field10 = field10;
        this.field11 = field11;
        this.field12 = field12;
        this.field13 = field13;
        this.field14 = field14;
        this.field15 = field15;
    }

    public static Builder builder(String field3, String field4, String field11) {
        return new Builder();
    }

    public static class Builder {
        private String field1;
        private String field2;
        private String field3;
        private String field4;
        private String field5;
        private String field6;
        private String field7;
        private String field8;
        private String field9;
        private String field10;
        private String field11;
        private String field12;
        private String field13;
        private String field14;
        private String field15;

        public Builder setField1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder setField2(String field2) {
            this.field2 = field2;
            return this;
        }

        public Builder setField3(String field3) {
            this.field3 = field3;
            return this;
        }

        public Builder setField4(String field4) {
            this.field4 = field4;
            return this;
        }

        public Builder setField5(String field5) {
            this.field5 = field5;
            return this;
        }

        public Builder setField6(String field6) {
            this.field6 = field6;
            return this;
        }

        public Builder setField7(String field7) {
            this.field7 = field7;
            return this;
        }

        public Builder setField8(String field8) {
            this.field8 = field8;
            return this;
        }

        public Builder setField9(String field9) {
            this.field9 = field9;
            return this;
        }

        public Builder setField10(String field10) {
            this.field10 = field10;
            return this;
        }

        public Builder setField11(String field11) {
            this.field11 = field11;
            return this;
        }

        public Builder setField12(String field12) {
            this.field12 = field12;
            return this;
        }

        public Builder setField13(String field13) {
            this.field13 = field13;
            return this;
        }

        public Builder setField14(String field14) {
            this.field14 = field14;
            return this;
        }

        public Builder setField15(String field15) {
            this.field15 = field15;
            return this;
        }

        public Home build() {
            return new Home(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15);
        }
    }
}