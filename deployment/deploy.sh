scp docker-compose.yml grzybek:generatorinator/
ssh grzybek docker-compose -f generatorinator/docker-compose.yml down
ssh grzybek docker-compose -f generatorinator/docker-compose.yml up -d