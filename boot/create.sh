# This bash script will be used to create my sports docker image
# I will use this script instead of manually entering in commands
# So I don't accidentially make a spelling mistake

docker build -t jiawen142/sports:file .
docker push jiawen142/sports:file