public class Ball {
    private int xPos;
    private int yPos;
    private int xVelocity;
    private int yVelocity;

    public Ball(int xPosIn, int yPosIn, int xVelocityIn, int yVelocityIn){
        xPos = xPosIn;
        yPos = yPosIn;
        xVelocity =xVelocityIn;
        yVelocity = yVelocityIn;
    }

    public void move(){
        if ((xPos== 0 || xPos+1== 10)){
            xVelocity = xVelocity * -1;
        }
        if ((yPos==0 || yPos+1 == 10)) {
            yVelocity = yVelocity * -1;
        }
        xPos = xPos + xVelocity;
        yPos = yPos + yVelocity;
    }

    public void ballPrint(){
        System.out.println("X:"+xPos+" Y: "+yPos);

    }

}
