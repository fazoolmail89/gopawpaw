package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IdhrHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IdhrHist
 * @author MyEclipse Persistence Tools
 */

public class IdhrHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IdhrHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IdhrHist transientInstance) {
		log.debug("saving IdhrHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IdhrHist persistentInstance) {
		log.debug("deleting IdhrHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IdhrHist findById(com.gopawpaw.erp.hibernate.i.IdhrHistId id) {
		log.debug("getting IdhrHist instance with id: " + id);
		try {
			IdhrHist instance = (IdhrHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IdhrHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IdhrHist instance) {
		log.debug("finding IdhrHist instance by example");
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
		log.debug("finding IdhrHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IdhrHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IdhrHist instances");
		try {
			String queryString = "from IdhrHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IdhrHist merge(IdhrHist detachedInstance) {
		log.debug("merging IdhrHist instance");
		try {
			IdhrHist result = (IdhrHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IdhrHist instance) {
		log.debug("attaching dirty IdhrHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IdhrHist instance) {
		log.debug("attaching clean IdhrHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IdhrHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IdhrHistDAO) ctx.getBean("IdhrHistDAO");
	}
}