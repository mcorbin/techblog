set -e
tag=$1
lein run
git add .
git commit -m "release ${tag}"
git tag -a "${tag}" -m "release ${tag}"
docker build -t mcorbin/techblog:${tag} .
docker push mcorbin/techblog:${tag}
git push --tags
git push
