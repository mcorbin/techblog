set -e
tag=$1
lein run
git tag -a "${tag}" -m "release ${tag}"
docker build -t mcorbin/techblog:${tag} .
docker push mcorbin/techblog:${tag}
