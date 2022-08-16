package main

import (
	"fmt"
	"math/cmplx"
)

// basic types
var (
	MyBool   bool   = false
	MyString string = "myString"
	// has -2 2
	MyInt   int   = 2
	MyInt8  int8  = 8
	MyInt16 int16 = 16
	MyInt32 int32 = 32
	MyInt64 int64 = 64
	// only 0,1,2,3,4...
	MyUint   uint   = 2
	MyUint8  uint8  = 8
	MyUint16 uint16 = 16
	MyUint32 uint32 = 32
	MyUint64 uint64 = 64
	// alias uint32
	MyByte byte = 8
	// unicode8 single code
	MyRune       rune    = 167
	MyFloat32    float32 = 32.0
	MyFloat64    float64 = 64.0
	MyComplex64  complex64
	MyComplex128 complex128 = cmplx.Sqrt(-5 + 12i)
)

var (
	ToBe   bool       = false
	MaxInt uint64     = 1<<64 - 1
	z      complex128 = cmplx.Sqrt(-5 + 12i)
)

func main() {
	var formatString string = "Type: %T Value: %v\n"
	fmt.Printf(formatString, ToBe, ToBe)
	fmt.Printf(formatString, MaxInt, MaxInt)
	fmt.Printf(formatString, z, z)
}
