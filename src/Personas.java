public class Personas {
		private int cod;
		private String nif;
		private String nombre;
		private String domicilio;

				
		public Personas() {
		}

		public Personas(int cod ) {
			this.cod = cod;
		}

		public Personas(int cod, String nif,
				String nombre, String domicilio) {
			this.cod = cod;
			this.nif=nif;
			this.nombre = nombre;
			this.domicilio = domicilio;
		}

		/**
		 * @return the cod
		 */
//en prueba
		/**
		 * @param cod the cod to set
		 */
		public void setCod(int cod) {
			this.cod = cod;
		}

				/**
		 * @return the nif
		 */
		public String getNif() {
			return nif;
		}

				/**
		 * @param nif the nif to set
		 */
		public void setNif(String nif) {
			this.nif = nif;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the domicilio
		 */
		public String getDomicilio() {
			return domicilio;
		}

		/**
		 * @param domicilio the domicilio to set
		 */
		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}

		
}

				
		