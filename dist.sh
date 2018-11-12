#!/bin/bash

KEYSTORE=keystore.jks
KEYSTORE_PASS=password
KEYSTORE_ALIAS=key

cd "$( dirname "${BASH_SOURCE[0]}" )"

rm -r dist

mkdir -p dist/permissao

cp -r api dist/permissao/

cp -r target/jnlp dist/permissao/

cp misc/launch.jnlp dist/permissao/jnlp/

cp misc/index.html dist/permissao/

cp misc/htaccess dist/permissao/

cp misc/htaccess_jnlp dist/permissao/jnlp/.htaccess

cp misc/htaccess_api dist/permissao/api/.htaccess

for jar in dist/permissao/jnlp/*.jar; do
    jarsigner -keystore $KEYSTORE -storepass $KEYSTORE_PASS -tsa http://timestamp.digicert.com $jar $KEYSTORE_ALIAS
done

cd dist

zip -r permissao.zip permissao
