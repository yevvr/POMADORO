./gradlew build -x test

cd docker/app && docker build -t pomodoro-image .

docker-compose up -d