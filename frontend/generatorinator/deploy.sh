docker build -t grzybek/generatorinator-frontend .
ssh grzybek docker stop $(docker ps -q --filter ancestor=grzybek/generatorinator-frontend )
docker save grzybek/generatorinator-frontend | bzip2 | pv | ssh grzybek docker load