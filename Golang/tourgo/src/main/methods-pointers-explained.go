package main

import (
	"fmt"
	"math"
)

type Vertex struct {
	X, Y float64
}

func Abs(v Vertex) float64 {
	return math.Sqrt(v.X*v.X + v.Y*v.Y)
}

func Scale(v *Vertex, f float64) {
	v.X = v.X * f
	v.Y = v.Y * f
}

func main() {
	// expect output 5.0
	var v = Vertex{X: 3.0, Y: 4.0}
	fmt.Println(Abs(v))

	// expect output {6.0, 8.0}
	Scale(&v, 2.0)
	fmt.Println(v)
}
