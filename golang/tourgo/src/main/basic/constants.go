package main

import "fmt"

// PI type not must need
const PI float64 = 3.14

// const variable can not change
func main() {
	const World = "world"
	fmt.Println("Hello", World)
	fmt.Println("Hello", PI, "Day")

	const Truth = true
	fmt.Println("Go rules is ", Truth)
}
