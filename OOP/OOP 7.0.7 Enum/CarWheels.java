public enum CarWheels {
	LF(250),
	RF(250),
	RB(250),
    LB(250);
      
     CarWheels(int pressureLevel){
        pressure = pressureLevel;
    }
     
    private int pressure;
     
    public int getPressure(){
        return pressure;
    }      
}
