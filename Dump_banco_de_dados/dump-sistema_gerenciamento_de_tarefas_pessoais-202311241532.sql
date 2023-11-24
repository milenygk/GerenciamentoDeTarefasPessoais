-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_gerenciamento_de_tarefas_pessoais
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anotacoes`
--

DROP TABLE IF EXISTS `anotacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `anotacoes` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data` date NOT NULL,
  `anotacoes` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anotacoes`
--

LOCK TABLES `anotacoes` WRITE;
/*!40000 ALTER TABLE `anotacoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `anotacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `balanco_mensal`
--

DROP TABLE IF EXISTS `balanco_mensal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `balanco_mensal` (
  `id` int NOT NULL,
  `id_finaceiro` int NOT NULL,
  `total_de_ganhos` varchar(100) NOT NULL,
  `total_de_gastos` varchar(100) NOT NULL,
  `total_positivo` varchar(100) NOT NULL,
  `objetivos_financeiros` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `balanco_mensal`
--

LOCK TABLES `balanco_mensal` WRITE;
/*!40000 ALTER TABLE `balanco_mensal` DISABLE KEYS */;
/*!40000 ALTER TABLE `balanco_mensal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calendario`
--

DROP TABLE IF EXISTS `calendario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calendario` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data` date NOT NULL,
  `dia` varchar(50) NOT NULL,
  `mes` varchar(50) NOT NULL,
  `ano` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendario`
--

LOCK TABLES `calendario` WRITE;
/*!40000 ALTER TABLE `calendario` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Planejamento'),(2,'Habitos'),(3,'Hobbies'),(4,'Obrigacoes'),(5,'Trabalho'),(6,'Estudo'),(7,'Metas'),(8,'Financeiro'),(9,'Viagens'),(10,'anotacoes\r\n'),(11,'Calendario'),(12,'Minha_conta');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `controle_financeiro_diario`
--

DROP TABLE IF EXISTS `controle_financeiro_diario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `controle_financeiro_diario` (
  `id` int NOT NULL,
  `id_finaceiro` int NOT NULL,
  `data` date NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `valor` varchar(100) NOT NULL,
  `total` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controle_financeiro_diario`
--

LOCK TABLES `controle_financeiro_diario` WRITE;
/*!40000 ALTER TABLE `controle_financeiro_diario` DISABLE KEYS */;
/*!40000 ALTER TABLE `controle_financeiro_diario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `controle_financeiro_mensal`
--

DROP TABLE IF EXISTS `controle_financeiro_mensal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `controle_financeiro_mensal` (
  `id` int NOT NULL,
  `id_finaceiro` int NOT NULL,
  `id_balanco_mensal` int NOT NULL,
  `ganos` varchar(100) NOT NULL,
  `id_gastos_fixos` int NOT NULL,
  `id_outros_gastos` int NOT NULL,
  `total` varchar(100) NOT NULL,
  `saldo_atual` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controle_financeiro_mensal`
--

LOCK TABLES `controle_financeiro_mensal` WRITE;
/*!40000 ALTER TABLE `controle_financeiro_mensal` DISABLE KEYS */;
/*!40000 ALTER TABLE `controle_financeiro_mensal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `controle_financeiro_semanal`
--

DROP TABLE IF EXISTS `controle_financeiro_semanal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `controle_financeiro_semanal` (
  `id` int NOT NULL,
  `id_finaceiro` int NOT NULL,
  `do_dia` date NOT NULL,
  `ao_dia` date NOT NULL,
  `total` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controle_financeiro_semanal`
--

LOCK TABLES `controle_financeiro_semanal` WRITE;
/*!40000 ALTER TABLE `controle_financeiro_semanal` DISABLE KEYS */;
/*!40000 ALTER TABLE `controle_financeiro_semanal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudo`
--

DROP TABLE IF EXISTS `estudo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudo` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data` date NOT NULL,
  `materia` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `conteudo` varchar(100) NOT NULL,
  `tempo_estudo` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudo`
--

LOCK TABLES `estudo` WRITE;
/*!40000 ALTER TABLE `estudo` DISABLE KEYS */;
INSERT INTO `estudo` VALUES (1,6,'2023-11-17','Portugues','Texto dicertativo argumentativo','3 horas');
/*!40000 ALTER TABLE `estudo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financeiro`
--

DROP TABLE IF EXISTS `financeiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `financeiro` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data` date NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `valor` int NOT NULL,
  `total` int DEFAULT NULL,
  `quantidade` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financeiro`
--

LOCK TABLES `financeiro` WRITE;
/*!40000 ALTER TABLE `financeiro` DISABLE KEYS */;
INSERT INTO `financeiro` VALUES (1,8,'2023-11-08','shampoo eudora','beleza',35,NULL,3),(2,8,'2023-11-08','Sabonete Liquido Nivea','Beleza',15,NULL,5),(3,8,'2023-11-17','asdsadasdsad','asdasd',15,15,1);
/*!40000 ALTER TABLE `financeiro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gastos_fixos`
--

DROP TABLE IF EXISTS `gastos_fixos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gastos_fixos` (
  `id` int NOT NULL,
  `data` date NOT NULL,
  `valor` varchar(100) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gastos_fixos`
--

LOCK TABLES `gastos_fixos` WRITE;
/*!40000 ALTER TABLE `gastos_fixos` DISABLE KEYS */;
/*!40000 ALTER TABLE `gastos_fixos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitos`
--

DROP TABLE IF EXISTS `habitos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habitos` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `novo_habito` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitos`
--

LOCK TABLES `habitos` WRITE;
/*!40000 ALTER TABLE `habitos` DISABLE KEYS */;
INSERT INTO `habitos` VALUES (1,2,'dormir todos os dias às 22 horas');
/*!40000 ALTER TABLE `habitos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hobbies`
--

DROP TABLE IF EXISTS `hobbies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hobbies` (
  `id` int NOT NULL,
  `esportes` varchar(100) NOT NULL,
  `jogos` varchar(100) NOT NULL,
  `leitura` varchar(100) NOT NULL,
  `filmes` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_categoria` int NOT NULL,
  `series` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hobbies`
--

LOCK TABLES `hobbies` WRITE;
/*!40000 ALTER TABLE `hobbies` DISABLE KEYS */;
INSERT INTO `hobbies` VALUES (1,'volei','uno','orgulho e preconceito','litlle woman',3,'friends');
/*!40000 ALTER TABLE `hobbies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metas`
--

DROP TABLE IF EXISTS `metas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metas` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `meta` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ano` int NOT NULL,
  `categoria` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metas`
--

LOCK TABLES `metas` WRITE;
/*!40000 ALTER TABLE `metas` DISABLE KEYS */;
INSERT INTO `metas` VALUES (1,7,'Comprar um carro',2024,'financeiro');
/*!40000 ALTER TABLE `metas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `minha_conta`
--

DROP TABLE IF EXISTS `minha_conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `minha_conta` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `minha_conta`
--

LOCK TABLES `minha_conta` WRITE;
/*!40000 ALTER TABLE `minha_conta` DISABLE KEYS */;
/*!40000 ALTER TABLE `minha_conta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `obrigacoes`
--

DROP TABLE IF EXISTS `obrigacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `obrigacoes` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data` date NOT NULL,
  `obrigacao` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `obrigacoes`
--

LOCK TABLES `obrigacoes` WRITE;
/*!40000 ALTER TABLE `obrigacoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `obrigacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `outros_gastos`
--

DROP TABLE IF EXISTS `outros_gastos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `outros_gastos` (
  `id` int NOT NULL,
  `data` date NOT NULL,
  `valor` varchar(100) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `outros_gastos`
--

LOCK TABLES `outros_gastos` WRITE;
/*!40000 ALTER TABLE `outros_gastos` DISABLE KEYS */;
/*!40000 ALTER TABLE `outros_gastos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoa` (
  `id` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  `sobrenome` varchar(100) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `dataDeNascimento` date NOT NULL,
  `genero` varchar(30) NOT NULL,
  `telefone` varchar(12) NOT NULL,
  `email` varchar(30) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,'Mileny','Garaluz','12356945970','2005-06-01','feminino','44 9857-2542','mileny@e-mail','rua ipanema, 301','Campo Mourão','PR','','');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planejamento_anual`
--

DROP TABLE IF EXISTS `planejamento_anual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planejamento_anual` (
  `id` int NOT NULL,
  `id_planejamentos` int NOT NULL,
  `data` date NOT NULL,
  `planejamento_do_ano` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planejamento_anual`
--

LOCK TABLES `planejamento_anual` WRITE;
/*!40000 ALTER TABLE `planejamento_anual` DISABLE KEYS */;
/*!40000 ALTER TABLE `planejamento_anual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planejamento_diario`
--

DROP TABLE IF EXISTS `planejamento_diario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planejamento_diario` (
  `id` int NOT NULL,
  `data` date NOT NULL,
  `rotina_manha` varchar(10000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `rotina_tarde` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `rotina_noite` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tarefas_pontuais` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_categoria` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planejamento_diario`
--

LOCK TABLES `planejamento_diario` WRITE;
/*!40000 ALTER TABLE `planejamento_diario` DISABLE KEYS */;
/*!40000 ALTER TABLE `planejamento_diario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planejamento_mensal`
--

DROP TABLE IF EXISTS `planejamento_mensal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planejamento_mensal` (
  `id` int NOT NULL,
  `id_planejamentos` int NOT NULL,
  `data` date NOT NULL,
  `planejamento_do_mes` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planejamento_mensal`
--

LOCK TABLES `planejamento_mensal` WRITE;
/*!40000 ALTER TABLE `planejamento_mensal` DISABLE KEYS */;
/*!40000 ALTER TABLE `planejamento_mensal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planejamento_semanal`
--

DROP TABLE IF EXISTS `planejamento_semanal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planejamento_semanal` (
  `id` int NOT NULL,
  `id_planejamentos` int NOT NULL,
  `data` date NOT NULL,
  `planejamento_da_semana` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planejamento_semanal`
--

LOCK TABLES `planejamento_semanal` WRITE;
/*!40000 ALTER TABLE `planejamento_semanal` DISABLE KEYS */;
/*!40000 ALTER TABLE `planejamento_semanal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planejamentos`
--

DROP TABLE IF EXISTS `planejamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planejamentos` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data` date NOT NULL,
  `rotina_manha` varchar(10000) NOT NULL,
  `rotina_tarde` varchar(1000) NOT NULL,
  `rotina_noite` varchar(1000) NOT NULL,
  `tarefas_pontuais` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planejamentos`
--

LOCK TABLES `planejamentos` WRITE;
/*!40000 ALTER TABLE `planejamentos` DISABLE KEYS */;
INSERT INTO `planejamentos` VALUES (1,1,'2023-11-13','07:00 - ACORDAR, 07:30 - TOMAR CAFÉ DA MANHÃ, 08:00 - TRABALHAR','13:30/17:30 - TRABALHAR','18:00 - BANHO, 20:00 JANTAR, 22:00 DORMIR','08:00 TARALHAR');
/*!40000 ALTER TABLE `planejamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabalho`
--

DROP TABLE IF EXISTS `trabalho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabalho` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data` date NOT NULL,
  `importante` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `urgente` varchar(100) NOT NULL,
  `importante_urgente` varchar(100) NOT NULL,
  `nao_importante_nem_urgente` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabalho`
--

LOCK TABLES `trabalho` WRITE;
/*!40000 ALTER TABLE `trabalho` DISABLE KEYS */;
INSERT INTO `trabalho` VALUES (1,5,'2023-11-17','Arquivar Documentos','Lançar notas','Fazer pedidos','Dar entrada no estoque');
/*!40000 ALTER TABLE `trabalho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL,
  `id_pessoa` int NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,1,'mileny','1234');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viagens`
--

DROP TABLE IF EXISTS `viagens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viagens` (
  `id` int NOT NULL,
  `id_categoria` int NOT NULL,
  `data_de_ida` date NOT NULL,
  `pais` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `data_volta` date NOT NULL,
  `detalhes` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viagens`
--

LOCK TABLES `viagens` WRITE;
/*!40000 ALTER TABLE `viagens` DISABLE KEYS */;
INSERT INTO `viagens` VALUES (1,9,'2023-11-10','Brasil','Paraná','Curitiba','2023-11-12','Viagem para conhecer a cidade de curitiba ');
/*!40000 ALTER TABLE `viagens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sistema_gerenciamento_de_tarefas_pessoais'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-24 15:32:50
