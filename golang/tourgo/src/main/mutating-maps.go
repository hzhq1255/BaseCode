package main

import "fmt"

func main() {
	var m map[string]int = make(map[string]int)
	m["a"] = 1
	fmt.Println("The value is ", m["a"])

	m["a"] = 2
	fmt.Println("The value is ", m["a"])

	var (
		v  int
		ok bool
	)

	v, ok = m["a"]
	fmt.Println("The value is", v, "Present ?", ok)

	delete(m, "a")
	fmt.Println("The value is ", m["a"])

	v, ok = m["a"]
	fmt.Println("The value is", v, "Present ?", ok)

}
