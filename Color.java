public enum Color {

    RED("#FF0000"){
        @Override
        public Color Deep() {
            this.setColorCode("#2F0000");
            return this;
        }

        @Override
        public Color Shallow() {
            this.setColorCode("#FFECEC");
            return this;
        }
    }, YELLOW("#FFFF6F"){
        @Override
        public Color Deep() {
            this.setColorCode("#424200");
            return this;
        }

        @Override
        public Color Shallow() {
            this.setColorCode("#FFFFF4");
            return this;
        }
    },GREEN("#28FF28"){
        @Override
        public Color Deep() {
            this.setColorCode("#006000");
            return this;
        }

        @Override
        public Color Shallow() {
            this.setColorCode("#F0FFF0");
            return this;
        }
    },BLUE("#2828FF"){
        @Override
        public Color Deep() {
            this.setColorCode("#000079");
            return this;
        }

        @Override
        public Color Shallow() {
            this.setColorCode("#ECECFF");
            return this;
        }
    };


    private String ColorCode;

    Color(String ColorCode){
        this.ColorCode = ColorCode;
    }


    public void setColorCode(String ColorCode){
        this.ColorCode = ColorCode;
    }
    public String getColorCode(){
        return this.ColorCode;
    }
    public abstract Color Deep();
    public abstract Color Shallow();
}
