package firstPackage;

public class Square {

        public float getSide() {
            return side;
        }

        public void setSide(float side) {
            this.side = side;
        }

        public float area(){
            return side * side;
        }

        private float side;

}
