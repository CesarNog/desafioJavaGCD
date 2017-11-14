package magiccards.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "magicexpansion")
public class Expansion {
	
	/*
	 `ExpansionId` int(10) NOT NULL AUTO_INCREMENT,
	  `Name` text NOT NULL,
	  `PtBRName` text,
	  `LinkName` text NOT NULL,
	  `Code` varchar(16) NOT NULL,
	  `LaunchDate` date NOT NULL,
	  `ExpansionCategoryId` smallint(5) NOT NULL,
	  `IsPromo` bit(1) DEFAULT NULL,
	  `IsLegal` bit(1) DEFAULT NULL,
	  PRIMARY KEY (`ExpansionId`),
	  UNIQUE KEY `PK_MagicExpansion` (`ExpansionId`),
	  KEY `FK_MagicExpansion_MagicExpansionCategory` (`ExpansionCategoryId`),
	  CONSTRAINT `magicexpansion_ibfk_1` FOREIGN KEY (`ExpansionCategoryId`) REFERENCES `magicexpansioncategory` (`ExpansionCategoryId`) ON UPDATE CASCADE	  
	*/	
	@Id
	@Column(name = "expansionid")
	private Integer expansionId;	
	@Column(name = "name", columnDefinition = "text")
	private String name;
	@Column(name = "ptbrname", columnDefinition = "text")
	private String ptBrName;
	@Column(name = "linkname", columnDefinition = "text")
	private String linkName;
	@Column(name = "expansioncategoryid")
	private short expansionCategoryId;
	@Column(name = "ispromo")
	private Boolean isPromo;
	@Column(name = "islegal")
	private Boolean isLegal;

}
