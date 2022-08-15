package main

import (
	"fmt"
	"math"
)

type Abser interface {
	Abs() float64
}

type MyFloat64 float64

func (myFloat64 MyFloat64) Abs() float64 {
	if myFloat64 < 0 {
		return -float64(myFloat64)
	}
	return float64(myFloat64)
}

type Vertex struct {
	X, Y float64
}

func (v *Vertex) Abs() float64 {
	return math.Sqrt(v.X*v.X + v.Y*v.Y)
}

//func (v Vertex) Abs() float64 {
//	return math.Sqrt(v.X*v.X + v.Y*v.Y)
//}

func main() {
	var a Abser
	var f = MyFloat64(-math.Sqrt2)
	var v = Vertex{3, 4}
	a = f
	fmt.Println(a.Abs())
	a = &v
	fmt.Println(a.Abs())
	// Vertex value type not implement Abser
	// a = v
}
