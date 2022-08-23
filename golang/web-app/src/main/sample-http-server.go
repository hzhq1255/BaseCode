package main

import (
	"fmt"
	"net/http"
)

// handler
func SampleHandler(w http.ResponseWriter, r *http.Request) {
	// 获取页面上路径第一个 "/" 后的内容 打印出来
	fmt.Fprintf(w, "Hi there, I love %s!", r.URL.Path[1:])
}

//func main() {
//	// http 捕获所有的请求到 "/" 的网页
//	http.HandleFunc("/", handler)
//	// 监听所有网卡上的 8080 端口
//	log.Fatalln(http.ListenAndServe(":8080", nil))
//}
