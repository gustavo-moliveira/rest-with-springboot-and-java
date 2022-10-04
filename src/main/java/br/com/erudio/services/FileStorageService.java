package br.com.erudio.services;

import br.com.erudio.config.FileStorageConfig;
import br.com.erudio.config.database.Connection;
import br.com.erudio.exceptions.FileStorageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.Normalizer;

@Service
public class FileStorageService {
    private final Path fileStorageLocation;
//    private FundoRepository fileRepository;

//    private Fundo fundo;

    @Autowired
    public FileStorageService(FileStorageConfig fileStorageConfig) {
        Path path = Paths.get(fileStorageConfig.getUploadDir())
                .toAbsolutePath().normalize();
        this.fileStorageLocation = path;

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception e) {
            throw new FileStorageException("Could not create the directory where the upload files will be stored!", e);
        }
    }

    private static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public String storeFile(MultipartFile file) throws IOException, ParserConfigurationException, SAXException {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
            if (filename.contains("..")) {
                throw new FileStorageException("Sorry! filename contains invalid path sequence " + filename);
            }
            Path targetLocation = this.fileStorageLocation.resolve(filename);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            Connection configMysql = new Connection("mysql");
            JdbcTemplate conMysql = new JdbcTemplate(configMysql.getDatasource());
            File fXmlFile = new File(String.valueOf(targetLocation));
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            NodeList nList = doc.getElementsByTagName("header");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                //System.out.println("\nElemento corrente :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
//                    fundo.setIsin(removerAcentos(eElement.getElementsByTagName("isin").item(0).getTextContent()));
//                    fundo.setNome(removerAcentos(eElement.getElementsByTagName("nome").item(0).getTextContent()));
//                    fundo.setDtPosicao(eElement.getElementsByTagName("dtposicao").item(0).getTextContent());
//                    fundo.setNomeAdm(removerAcentos(eElement.getElementsByTagName("nomeadm").item(0).getTextContent()));
//                    fundo.setCnpjAdm(Integer.valueOf(eElement.getElementsByTagName("cnpjadm").item(0).getTextContent()));
//                    fundo.setNomeGestor(removerAcentos(eElement.getElementsByTagName("nomegestor").item(0).getTextContent()));
//                    fundo.setCnpjGestor(Integer.valueOf(eElement.getElementsByTagName("cnpjgestor").item(0).getTextContent()));
//                    fundo.setNomeCustodiante(removerAcentos(eElement.getElementsByTagName("nomecustodiante").item(0).getTextContent()));
//                    fundo.setCnpjCustodiante(Integer.valueOf(eElement.getElementsByTagName("cnpjcustodiante").item(0).getTextContent()));
//                    fundo.setValorCota(Double.valueOf(eElement.getElementsByTagName("valorcota").item(0).getTextContent()));
//                    fundo.setQuantidade(Double.valueOf(eElement.getElementsByTagName("quantidade").item(0).getTextContent()));
//                    fundo.setPatLiq(Double.valueOf(eElement.getElementsByTagName("patliq").item(0).getTextContent()));
//                    fundo.setValorAtivos(Double.valueOf(eElement.getElementsByTagName("valorativos").item(0).getTextContent()));
//                    fundo.setValorReceber(Double.valueOf(eElement.getElementsByTagName("valorreceber").item(0).getTextContent()));
//                    fundo.setValorPagar(Double.valueOf(eElement.getElementsByTagName("valorpagar").item(0).getTextContent()));
//                    fundo.setValorCotasEmitir(Double.valueOf(eElement.getElementsByTagName("vlcotasemitir").item(0).getTextContent()));
//                    fundo.setValorCotasResgatar(Double.valueOf(eElement.getElementsByTagName("vlcotasresgatar").item(0).getTextContent()));
//                    fundo.setCodAnbid(Integer.valueOf(eElement.getElementsByTagName("codanbid").item(0).getTextContent()));
//                    fundo.setTipoFundo(Integer.valueOf(eElement.getElementsByTagName("tipofundo").item(0).getTextContent()));
//                    fileRepository.save(fundo);
                    var dado1 = removerAcentos(eElement.getElementsByTagName("isin").item(0).getTextContent());
                    var dado2 = removerAcentos(eElement.getElementsByTagName("cnpj").item(0).getTextContent());
                    var dado3 = removerAcentos(eElement.getElementsByTagName("nome").item(0).getTextContent());
                    var dado4 = removerAcentos(eElement.getElementsByTagName("dtposicao").item(0).getTextContent());
                    var dado5 = removerAcentos(eElement.getElementsByTagName("nomeadm").item(0).getTextContent());
                    var dado6 = removerAcentos(eElement.getElementsByTagName("cnpjadm").item(0).getTextContent());
                    var dado7 = removerAcentos(eElement.getElementsByTagName("nomegestor").item(0).getTextContent());
                    var dado8 = removerAcentos(eElement.getElementsByTagName("cnpjgestor").item(0).getTextContent());
                    var dado9 = removerAcentos(eElement.getElementsByTagName("nomecustodiante").item(0).getTextContent());
                    var dado10 = removerAcentos(eElement.getElementsByTagName("cnpjcustodiante").item(0).getTextContent());
                    var dado11 = removerAcentos(eElement.getElementsByTagName("valorcota").item(0).getTextContent());
                    var dado12 = removerAcentos(eElement.getElementsByTagName("quantidade").item(0).getTextContent());
                    var dado13 = removerAcentos(eElement.getElementsByTagName("patliq").item(0).getTextContent());
                    var dado14 = removerAcentos(eElement.getElementsByTagName("valorativos").item(0).getTextContent());
                    var dado15 = removerAcentos(eElement.getElementsByTagName("valorreceber").item(0).getTextContent());
                    var dado16 = removerAcentos(eElement.getElementsByTagName("valorpagar").item(0).getTextContent());
                    var dado17 = removerAcentos(eElement.getElementsByTagName("vlcotasemitir").item(0).getTextContent());
                    var dado18 = removerAcentos(eElement.getElementsByTagName("vlcotasresgatar").item(0).getTextContent());
                    var dado19 = removerAcentos(eElement.getElementsByTagName("codanbid").item(0).getTextContent());
                    var dado20 = removerAcentos(eElement.getElementsByTagName("tipofundo").item(0).getTextContent());

                    conMysql.update("INSERT INTO fundos_header(isin, cnpj, nome, dt_posicao, nome_adm, cnpj_adm, nome_gestor, cnpj_gestor," +
                                    "nome_custodiante, cnpj_custodiante, vl_cota, quantidade, pat_liq, vl_ativos, vl_receber," +
                                    "vl_pagar, vl_cotas_emitir, vl_cotas_resgatar, cod_anbid, tipo_fundo)"
                                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ",
                            dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10, dado11, dado12, dado13,
                            dado14, dado15, dado16, dado17, dado18, dado19, dado20);
                }
            }
        return filename;
    }
}

