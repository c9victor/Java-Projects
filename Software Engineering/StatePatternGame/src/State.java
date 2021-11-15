public interface State {
    void upPressed();
    void upReleased();
    void downPressed();
    void downReleased();
    void escPressed();
    void timeExpired();
    void hitByRoll();
    void hitByThrow();
    void hitByFire();
}
