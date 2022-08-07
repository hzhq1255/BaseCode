package main

import "fmt"

type A struct {
	x int
	y B
}

type B struct {
	y int
}

func main() {
	a := A{1, B{2}}
	fmt.Println(a)
	var s []struct {
		a int
		b bool
	} = []struct {
		a int
		b bool
	}{
		{1, true},
	}

	fmt.Println(s)

}
