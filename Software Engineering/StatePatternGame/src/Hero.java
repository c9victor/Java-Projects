public class Hero {
    private String name;
    private int numCreds;
    private int health;
    
    State deadState;
    State divingState;
    State duckingState;
    State jumpingState;
    State shieldedState;
    State standingState;
    
    State state;
    
    public Hero(String name) {
        deadState = new DeadState(this);
        divingState = new DivingState(this);
        duckingState = new DuckingState(this);
        jumpingState = new JumpingState(this);
        shieldedState = new ShieldedState(this);
        standingState = new StandingState(this);
        
        this.name = name;
        numCreds = 2;
        health = 3;
        
        state = standingState;
    }
    
    public void upPressed() {
        state.upPressed();
    }
    
    public void upReleased() {
        state.upReleased();
    }
    
    public void downPressed() {
        state.downPressed();
    }
    
    public void downReleased() {
        state.downReleased();
    }
    
    public void escPressed() {
        state.escPressed();
    }
    
    public void timeExpired() {
        state.timeExpired();
    }
    
    public void hitByRoll() {
        state.hitByRoll();
    }
    
    public void hitByThrow() {
        state.hitByThrow();
    }
    
    public void hitByFire() {
        state.hitByFire();
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumCreds() {
        return numCreds;
    }
    
    public void setNumCreds(int creds) {
        this.numCreds = creds;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public State getDeadState() {
        return deadState;
    }
    
    public State getDivingState() {
        return divingState;
    }
    
    public State getDuckingState() {
        return duckingState;
    }
    
    public State getJumpingState() {
        return jumpingState;
    }
    
    public State getShieldedState() {
        return shieldedState;
    }
    
    public State getStandingState() {
        return standingState;
    }
}
