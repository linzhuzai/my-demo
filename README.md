# 拉取最新镜像
docker pull crpi-30y88bxc6uf0bne6.cn-guangzhou.personal.cr.aliyuncs.com/lin-demo/my-demo:latest

# 停掉老容器
docker stop my-demo || true
docker rm my-demo || true

# 启动新容器（按你实际端口改）
docker run -d --name my-demo -p 8080:8080 crpi-30y88bxc6uf0bne6.cn-guangzhou.personal.cr.aliyuncs.com/lin-demo/my-demo:latest