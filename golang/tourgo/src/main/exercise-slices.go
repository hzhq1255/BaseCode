/*
 实现 Pic。它应当返回一个长度为 dy 的切片，其中每个元素是一个长度为 dx，元素类型为 uint8 的切片。当你运行此程序时，它会将每个整数解释为灰度值（好吧，其实是蓝度值）并显示它所对应的图像。

图像的选择由你来定。几个有趣的函数包括 (x+y)/2, x*y, x^y, x*log(y) 和 x%(y+1)。

（提示：需要使用循环来分配 [][]uint8 中的每个 []uint8；请使用 uint8(intValue) 在类型之间转换；你可能会用到 math 包中的函数。）
*/

package main

import (
	// clone to $GOPATH/src
	"math"

	"golang.org/x/tour/pic"
)

func Pic(dx, dy int) [][]uint8 {
	pic := make([][]uint8, dy)
	for y := range pic {
		pic[y] = make([]uint8, dx)
		for x := range pic[y] {
			// (x + y ) /2
			pic[y][x] = uint8((x + y) / 2)
			// x*y
			pic[y][x] = uint8(x * y)
			// x^y
			pic[y][x] = uint8(math.Pow(float64(x), float64(y)))
			// x^log(y)
			pic[y][x] = uint8(math.Pow(float64(x), math.Log2(float64(y))))
			//
			pic[y][x] = uint8(x % (y + 1))
		}
	}
	return pic
}

func main() {
	pic.Show(Pic)
}
