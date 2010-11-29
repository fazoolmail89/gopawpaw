package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EcaMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EcaMstr
 * @author MyEclipse Persistence Tools
 */

public class EcaMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EcaMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EcaMstr transientInstance) {
		log.debug("saving EcaMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EcaMstr persistentInstance) {
		log.debug("deleting EcaMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EcaMstr findById(com.gopawpaw.erp.hibernate.e.EcaMstrId id) {
		log.debug("getting EcaMstr instance with id: " + id);
		try {
			EcaMstr instance = (EcaMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EcaMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EcaMstr instance) {
		log.debug("finding EcaMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EcaMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EcaMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EcaMstr instances");
		try {
			String queryString = "from EcaMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EcaMstr merge(EcaMstr detachedInstance) {
		log.debug("merging EcaMstr instance");
		try {
			EcaMstr result = (EcaMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EcaMstr instance) {
		log.debug("attaching dirty EcaMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EcaMstr instance) {
		log.debug("attaching clean EcaMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EcaMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EcaMstrDAO) ctx.getBean("EcaMstrDAO");
	}
}