package main

import "fmt"

func main() {
	var i, j int = 1, 2
	k := 3
	// 类型推导(短声明) c 推导为 bool python 推导为 bool java 推导为 string
	c, python, java := true, false, "java"
	fmt.Println(i, j, k, c, python, java)

}
