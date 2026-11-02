jbang export maven App.java
pushd App
./mvnw versions:display-dependency-updates
popd
rm -f -r App

