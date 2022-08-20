package main

import (
	"fmt"
	"math"
)

type Person struct {
	Name string
	Age  int
}

func (p Person) String() string {
	return fmt.Sprintf("%v (%v years)", p.Name, p.Age)
}

type Vertex struct {
	X, Y float64
}

func (v Vertex) String() string {
	return fmt.Sprintf("X is %v  , Y is %v , Z is %v",
		v.X, v.Y, math.Sqrt(v.X*v.X+v.Y*v.Y))
}

func main() {
	var zhangsan = Person{"zhangsan", 23}
	var lisi = Person{"lisi", 40}
	fmt.Println(zhangsan, lisi)

	var vertex = Vertex{3, 4}
	fmt.Println(vertex)
}
