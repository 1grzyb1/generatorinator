docker build -t grzybek/generatorinator .
ssh grzybek docker stop $(docker ps -q --filter ancestor=grzybek/generatorinator )
docker save grzybek/generatorinator | bzip2 | pv | ssh grzybek docker load