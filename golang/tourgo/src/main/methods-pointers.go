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

func (v Vertex) Scale(f float64) {
	v.X = v.X * f
	v.Y = v.Y * f
}

func (v *Vertex) ScaleByPointer(f float64) {
	v.X = v.X * f
	v.Y = v.Y * f
}

// test base type
type MyFloat64 float64

func (mf MyFloat64) Add(f float64) float64 {
	return float64(mf) + f
}

func (mf *MyFloat64) SelfAdd(f float64) {
	*mf = *mf + MyFloat64(f)
	// mf = MyFloat64(float64(*mf) + f)
}

func main() {
	//var a = "a"
	// Vertex Abs
	var v = Vertex{X: 3, Y: 4}
	fmt.Print("Vertex{3, 4} Abs = ", v.Abs(), "\n")
	// Vertex 3 4 scale to 2x not by pointer
	// expect Vertex X,Y value not changed
	v.Scale(2)
	fmt.Println("scale not by pointer ", v)
	// Vertex 3 4 scale to 2x by pointer
	// expect Vertex X,Y value changed to Vertex{6,8}
	v.ScaleByPointer(2)
	fmt.Println("scale by pointer ", v)

	// base type add
	var mf = MyFloat64(1)
	fmt.Println("mf add value =", mf.Add(2))
	// base type add by pointer
	mf.SelfAdd(2)
	fmt.Println("mf self value =", mf)
}
