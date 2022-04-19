package main

import (
	"fmt"
	"math"
)

func Sqrt(x float64) (float64, int) {
	z := 1.0
	t := 1e-10
	//z -= (z*z - x) / (2*z)
	i := 0
	for ; (z*z-x)*(z*z-x) > t*t; i++ {
		z -= (z*z - x) / (2 * z)
	}
	return z, i
}

func main() {
	fmt.Println(Sqrt(2))
	fmt.Println(math.Sqrt(2))
}
