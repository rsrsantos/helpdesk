package br.com.rr.helpdesk.model;


import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fr_usuario", schema = "public")
@Getter
@Setter
@EqualsAndHashCode
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usr_codigo")
	private Integer id;

	@Column(name = "usr_nome")
	private String nome;

	@Column(name = "usr_login")
	private String usuario;

	@Column(name = "usr_senha")
	private String senha;

	@Column(name = "usr_email")
	private String email;
	
//	private String sexo;

	@Column(name = "usr_dias_expiracao")
	private Integer expiraAcessoDias;
	
	
//	private boolean inativo;
	
	@Column(name = "usr_statusdelete")
	private Integer statusDelete;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "usr_codigo_perfil")
	private UsuarioPerfil usuarioCodigoPerfil; 
	 
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "usr_inicio_expiracao")
	private Date expiraAcessoDataInicio;
	
	@Transient
	@Column(name = "usr_imagem_digital")
	private byte[] imagem;
	
	@Column(name = "usr_foto")
	private byte[] foto;
	
	@Column(name = "usr_administrador")
	private String isAdministrador;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "usr_ultimo_acesso")
	private Date ultimoAcesso;
	
	@Column(name = "usr_token")
	private String token;
	
	public Usuario() {
	}


	public String convertStringToMd5(String valor) {
		MessageDigest mDigest;
		try {
			mDigest = MessageDigest.getInstance("MD5");
			byte[] valorMD5 = mDigest.digest(valor.getBytes("UTF-8"));
			StringBuffer sb = new StringBuffer();
			for (byte b : valorMD5) {
				sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + ", email=" + email + "]";
	}
	
	

}
