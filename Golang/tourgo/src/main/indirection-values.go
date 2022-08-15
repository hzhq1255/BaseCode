package main

import (
	"fmt"
	"math"
)

type Vertex struct {
	X, Y float64
}

func (v Vertex) Abs() float64 {
	return math.Sqrt(v.X*v.X + v.Y*v.Y)
}

func AbsFunc(v Vertex) float64 {
	return math.Sqrt(v.X*v.X + v.Y*v.Y)
}

func main() {
	var v = Vertex{3, 4}
	// Abs value
	fmt.Println("value receivers abs", v.Abs())
	fmt.Println("value func abs", AbsFunc(v))

	// abs pointer
	var p = &v
	// p.Abs() equals (*p).Abs()
	fmt.Println("pointer receivers abs", p.Abs())
	fmt.Println("pointer func abs", AbsFunc(*p))

}
