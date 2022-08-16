package main

import (
	"fmt"
)

type IPAddr [4]byte

func (ipAddr IPAddr) String() string {
	var s, l = "", len(ipAddr)
	for i, v := range ipAddr {
		if i == l-1 {
			s += fmt.Sprintf("%v", v)
		} else {
			s += fmt.Sprintf("%v,", v)
		}
	}
	//s = fmt.Sprintf("%v,%v,%v,%v", ipAddr[0], ipAddr[1], ipAddr[2], ipAddr[3])
	return s
}

func main() {

	var hosts = map[string]IPAddr{
		"loopback":  {127, 0, 0, 1},
		"googleDNS": {8, 8, 8, 8},
	}
	for name, ip := range hosts {
		fmt.Printf("%v: %v ", name, ip)
	}
}
