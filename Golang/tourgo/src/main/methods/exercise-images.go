package main

import (
	"golang.org/x/tour/pic"
	"image"
	"image/color"
)

type Image struct {
	x, y int
}

func (i Image) ColorModel() color.Model {
	return color.RGBAModel
}

func (i Image) Bounds() image.Rectangle {
	return image.Rect(i.x, i.y, 255, 255)
}

func (i Image) At(x, y int) color.Color {
	return color.RGBA{R: uint8(x), G: uint8(y), B: 255, A: 255}
}

func main() {
	m := Image{50, 50}
	pic.ShowImage(m)
}
