package main

import (
	"fmt"
	"image"
)

// type Image Interface {
// ColorModel() color.Model
// Bounds() Rectangle
// At(x, y int) color.Color
// }
func main() {
	m := image.NewRGBA(image.Rect(0, 0, 100, 100))
	// 坐标系
	fmt.Println(m.Bounds())
	fmt.Println(m.At(0, 0).RGBA())
}
