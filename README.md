http://opensource.rock-chips.com/wiki_Status_Matrix

https://github.com/rockchip-linux/meta-rockchip/tree/yocto-next

To see all targets 

layers/meta-rockchip/conf/machine

## LOCAL COMPILATION

sudo apt-get install gawk wget git-core diffstat unzip texinfo gcc-multilib \
     build-essential chrpath socat libsdl1.2-dev xterm
     
## USED DOCKER TO BUILD
./build_docker.sh
sudo docker run -a stdin -a stdout -i -t yocto-tiner /bin/bash
source layers/poky/oe-init-build-env build-tinkerboard
bitbake core-image-minimal
