package main

import (
	"fmt"
	"math"
)

type Vertex struct {
	x, y float64
}

func (v Vertex) Abs() float64 {
	return math.Sqrt(v.x*v.x + v.y*v.y)
}

func (v Vertex) Square() float64 {
	return v.x * v.y
}

func (Vertex) Vertex(x, y float64) Vertex {
	return Vertex{x: x, y: y}
}

func add(v Vertex) float64 {
	return v.x + v.y
}

func main() {
	v := Vertex{3, 4}
	fmt.Println(v.Abs())
	fmt.Println(v.Square())
	fmt.Println(v.Vertex(3, 4))
	fmt.Println(add(v))
}
