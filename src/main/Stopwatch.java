package main;

public class Stopwatch {

  private long start;

  /**
   * Initializes a new stopwatch.
   */
  public Stopwatch() {
    start = System.nanoTime();
  }


  /**
   * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
   *
   * @return elapsed CPU time (in seconds) since the stopwatch was created
   */
  public double elapsedTime() {
    long now = System.nanoTime();
    return (now - start) / 1000000.0;
  }

  public void reset() {
    this.start = System.nanoTime();
  }
}
