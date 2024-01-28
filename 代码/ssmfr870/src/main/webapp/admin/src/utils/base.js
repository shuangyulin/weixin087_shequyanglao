const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmfr870/",
            name: "ssmfr870",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmfr870/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区养老服务小程序"
        } 
    }
}
export default base
