public double calcSqaureArea(int x, int y) {
  return calcSqaureArea(x) + calcTriangleArea(x, y);
}

//There's no need to modify calcSqaureArea or calcTriangleArea
public double calcSqaureArea(int side) {
  return side * side;
}

public double calcTriangleArea(int base, int height) {
  return 0.5 * base * height; 
