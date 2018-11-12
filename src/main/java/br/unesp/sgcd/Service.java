/*
 *  Copyright (C) 2016 FAAC - Faculdade de Arquitetura, Artes e Comunicação
 *  UNESP - Universidade Estadual Paulista “Júlio de Mesquita Filho”
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package br.unesp.sgcd;

import br.unesp.sgcd.beans.Menu;
import br.unesp.sgcd.beans.MenuResponsavel;
import br.unesp.sgcd.beans.Pagina;
import br.unesp.sgcd.beans.PaginaResponsavel;
import br.unesp.sgcd.beans.Permissao;
import br.unesp.sgcd.beans.PermissaoPK;
import br.unesp.sgcd.beans.PermissaoPagina;
import br.unesp.sgcd.beans.PermissaoPaginaPK;
import br.unesp.sgcd.beans.Usuario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Service {

    private final static Logger LOGGER = Logger.getLogger(Service.class.getName());

    private final URL codeBase;

    private Service() throws UnavailableServiceException {
        final BasicService bs = (BasicService) ServiceManager.lookup("javax.jnlp.BasicService");
        codeBase = bs.getCodeBase();
        LOGGER.info("codeBaseURL: " + codeBase.toString());
    }

    private static Service instance = null;

    public static void init() throws UnavailableServiceException {
        instance = new Service();
    }

    public static Service getInstance() {
        return instance;
    }

    private final CookieStore cookieStore = new BasicCookieStore();

    boolean persist(List<Permissao> listRemoverPermissao, List<PermissaoPagina> listRemoverPermissaoPagina, Set<Permissao> setAdicionarPermissao, Set<PermissaoPagina> setAdicionarPermissaoPagina) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/persist.php"));
            HttpPost httppost = new HttpPost(builder.build());
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            for (Permissao p : listRemoverPermissao) {
                nameValuePairs.add(new BasicNameValuePair("delPermissao[]", gson.toJson(new PermissaoPK(p.getMenu().getCodigo(), p.getUsuario().getLogin()))));
            }
            for (PermissaoPagina p : listRemoverPermissaoPagina) {
                nameValuePairs.add(new BasicNameValuePair("delPermissaoPagina[]", gson.toJson(new PermissaoPaginaPK(p.getPagina().getCodigo(), p.getUsuario().getLogin()))));
            }
            for (Permissao p : setAdicionarPermissao) {
                nameValuePairs.add(new BasicNameValuePair("addPermissao[]", gson.toJson(p)));
            }
            for (PermissaoPagina p : setAdicionarPermissaoPagina) {
                nameValuePairs.add(new BasicNameValuePair("addPermissaoPagina[]", gson.toJson(p)));
            }
            System.out.println(URLEncodedUtils.format(nameValuePairs, org.apache.http.protocol.HTTP.DEFAULT_CONTENT_CHARSET));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            System.out.println(input);
            return input.endsWith("ok");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return false;
    }

    boolean persistResponsavel(List<Menu> listMenu, List<Pagina> listPagina) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/persistResponsavel.php"));
            HttpPost httppost = new HttpPost(builder.build());
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            for (Menu menu : listMenu) {
                nameValuePairs.add(new BasicNameValuePair("menu[]", gson.toJson(new MenuResponsavel(menu.getCodigo(), menu.getUsuarioResponsavel()))));
            }
            for (Pagina pagina : listPagina) {
                nameValuePairs.add(new BasicNameValuePair("pagina[]", gson.toJson(new PaginaResponsavel(pagina.getCodigo(), pagina.getUsuarioResponsavel()))));
            }
            System.out.println(URLEncodedUtils.format(nameValuePairs, org.apache.http.protocol.HTTP.DEFAULT_CONTENT_CHARSET));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            System.out.println(input);
            return input.endsWith("ok");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Menu findMenu(int codigoMenu) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/findMenu.php"))
                    .setParameter("codigoMenu", "" + codigoMenu);
            HttpGet httpget = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            Menu m = gson.fromJson(input, Menu.class);
            return m;
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    List<Permissao> findPermissao(Menu menu) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/findPermissao.php"))
                    .setParameter("codigoMenu", "" + menu.getCodigo());
            HttpGet httpget = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            JsonParser parser = new JsonParser();
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            Permissao[] m = gson.fromJson(input, Permissao[].class);
            return Arrays.asList(m);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    List<PermissaoPagina> findPermissaoPagina(Menu menu) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/findPermissaoPagina.php"))
                    .setParameter("codigoPagina", "" + menu.getCodigoPagina());
            HttpGet httpget = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            PermissaoPagina[] m = gson.fromJson(input, PermissaoPagina[].class);
            return Arrays.asList(m);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    Pagina findPagina(Menu menu) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/findPagina.php"))
                    .setParameter("codigoPagina", "" + menu.getCodigoPagina());
            HttpGet httpget = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            Pagina m = gson.fromJson(input, Pagina.class);
            return m;
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    Usuario findUsuario(String u) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/findUsuario.php"));
            if (u != null) {
                builder.setParameter("login", u);
            }
            HttpGet httpget = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            Usuario m = gson.fromJson(input, Usuario.class);
            return m;
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    List<Usuario> findUsuarios(String u) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/findUsuario.php"));
            if (u != null) {
                builder.setParameter("tipo", u);
            }
            HttpGet httpget = new HttpGet(builder.build());
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
            Usuario[] m = gson.fromJson(input, Usuario[].class);
            return Arrays.asList(m);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private Cookie getCookie(String name) {
        for (Cookie c : cookieStore.getCookies()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    boolean authenticate(String usuario, String senha) {
        try {
            HttpClient httpclient = HttpClients.custom()
                    .setDefaultCookieStore(cookieStore)
                    .build();
            LOGGER.info("LOGIN URL: " + codeBase.toURI().resolve("../api/teste.php"));
            URIBuilder builder = new URIBuilder(codeBase.toURI().resolve("../api/teste.php"));
            HttpGet httpget = new HttpGet(builder.build());
            httpget.addHeader(BasicScheme.authenticate(
                    new UsernamePasswordCredentials(usuario, senha),
                    "UTF-8", false));
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String input = EntityUtils.toString(entity);
            LOGGER.info("Retorno: " + input);
            if ("ok".equals(input)) {
                return true;
            }
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
