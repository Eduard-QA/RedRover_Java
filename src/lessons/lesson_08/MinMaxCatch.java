package lessons.lesson_08;

public class MinMaxCatch {
    Catch minCatch;
    Catch maxCatch;

    public MinMaxCatch(Catch minCatch, Catch maxCatch) {
        this.minCatch = minCatch;
        this.maxCatch = maxCatch;
    }

    public MinMaxCatch() {

    }

    public Catch getMinCatch() {
        return minCatch;
    }

    public Catch getMaxCatch() {
        return maxCatch;
    }

    // Сеттеры (по желанию)
    public void setMinCatch(Catch minCatch) {
        this.minCatch = minCatch;
    }

    public void setMaxCatch(Catch maxCatch) {
        this.maxCatch = maxCatch;
    }
}
