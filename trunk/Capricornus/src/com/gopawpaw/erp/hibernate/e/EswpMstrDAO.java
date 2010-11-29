package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EswpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EswpMstr
 * @author MyEclipse Persistence Tools
 */

public class EswpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EswpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EswpMstr transientInstance) {
		log.debug("saving EswpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EswpMstr persistentInstance) {
		log.debug("deleting EswpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EswpMstr findById(com.gopawpaw.erp.hibernate.e.EswpMstrId id) {
		log.debug("getting EswpMstr instance with id: " + id);
		try {
			EswpMstr instance = (EswpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EswpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EswpMstr instance) {
		log.debug("finding EswpMstr instance by example");
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
		log.debug("finding EswpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EswpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EswpMstr instances");
		try {
			String queryString = "from EswpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EswpMstr merge(EswpMstr detachedInstance) {
		log.debug("merging EswpMstr instance");
		try {
			EswpMstr result = (EswpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EswpMstr instance) {
		log.debug("attaching dirty EswpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EswpMstr instance) {
		log.debug("attaching clean EswpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EswpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EswpMstrDAO) ctx.getBean("EswpMstrDAO");
	}
}