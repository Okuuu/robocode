package man;
import robocode.*;

int getOthers;

public class mrRobot extends Robot {
    public void run() {
	
        while (true) {
                ahead(100);
                turnRadarRight(360);
                turnRight(120);
                ahead(100);
             turnGunRight(360);
            }
        }

    public void onScannedRobot(ScannedRobotEvent e) {
                turnGunRight(getRadarHeading());
        double distance = e.getDistance();

        if(distance<200)
        {
            fire(3.5);
        }
        else if(distance<500)
        {
            fire(2.5);
        }
        else if(distance<800)
        {
            fire(1.5);
        }
        else
        {
            fire(0.5);
        }
		turnRight(30);
		ahead(50);
    }

    public void onHitByBullet(HitByBulletEvent event){
		turnRight(30);
		ahead(50);
    }

    public void onHitWall(HitWallEvent e){
        turnRight(90);
    }
}