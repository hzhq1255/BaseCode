package main

import "fmt"

type Vertex struct {
	X, Y float64
}

func (v *Vertex) Scale(f float64) {
	v.X = v.X * f
	v.Y = v.Y * f
}

//func (v Vertex) ScaleNoPointer(f float64) {
//	v.X = v.X * f
//	v.Y = v.Y * f
//}

func ScaleFunc(v *Vertex, f float64) {
	v.X = v.X * f
	v.Y = v.Y * f
}

func main() {
	var v = Vertex{X: 3, Y: 4}
	// pointer receivers type 1
	v.Scale(2.0)
	fmt.Println(v)
	// pointer receivers type2
	v = Vertex{X: 3, Y: 4}
	(&v).Scale(2.0)
	fmt.Println(v)
	// pointer receivers type3
	p := &Vertex{4, 3}
	p.Scale(3)
	ScaleFunc(p, 8)
	// pointer func
	v = Vertex{X: 3, Y: 4}
	ScaleFunc(&v, 2.0)
	fmt.Println(v)

}
